package com.example.mydairy.specific;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.example.mydairy.R;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class GraphQty extends AppCompatActivity {

    private LineChart mChart,mChart2;
    private FirebaseDatabase database;
    private DatabaseReference mPostReference;
    ValueEventListener valueEventListener;
    ArrayList<Entry> yData,yData1;
    ArrayList<String> xData,xData1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_qty);


        mChart = (LineChart)findViewById(R.id.specific_graph);
        mChart.animateX(1000);
        mChart2 = (LineChart)findViewById(R.id.specific_graph1);
        mChart2.animateX(1000);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String keyid = user.getUid();
        mPostReference = FirebaseDatabase.getInstance().getReference().child("users").child(keyid).child("DailyEntry");
        mPostReference.addValueEventListener(valueEventListener= new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot dataSnapshot) {

                yData = new ArrayList<>();
                yData1 = new ArrayList<>();
                xData = new ArrayList<String>();
                xData1 = new ArrayList<String>();
                Object []xD = xData.toArray();
                Object []xD1 = xData1.toArray();

                float i =0;
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    i=i+1;

                    String SV = ds.child("morning").child("quantity").getValue().toString();
                    Float SensorValue = Float.parseFloat(SV);

                    yData.add(new Entry(i,SensorValue));
                    xData.add(ds.getKey());

                }
                i=0;
                for (DataSnapshot ds : dataSnapshot.getChildren()){
                    i=i+1;

                    String SV2 = ds.child("evening").child("quantity").getValue().toString();
                    Float SensorValue2 = Float.parseFloat(SV2);

                    yData1.add(new Entry(i,SensorValue2));
                    xData1.add(ds.getKey());
                    Log.i("Jinil",ds.getKey());

                }

                final LineDataSet lineDataSet = new LineDataSet(yData,"Morning Quantity");
                LineData data = new LineData(lineDataSet);
                XAxis xaxis =mChart.getXAxis();
                xaxis.setPosition(XAxis.XAxisPosition.BOTTOM);
                xaxis.setCenterAxisLabels(false);
                YAxis yAxisRight = mChart.getAxisRight();
                yAxisRight.setEnabled(false);
                xaxis.setDrawGridLines(true);
                xaxis.setValueFormatter(new IAxisValueFormatter()
                {
                    @Override
                    public String getFormattedValue(float value, AxisBase axis) {

                        return xData.get((int)value-1);
                    }
                });

                if (xData.isEmpty()||xData.size()==1) {
                    mChart.clear();
                } else {
                    // set data
                    mChart.setData(data);
                    //mChart.setBackgroundColor(Color.rgb(244, 117, 117));
                }
                mChart.getXAxis().setGranularityEnabled(true);
                mChart.setNoDataText("Please add atleast 2 Entries");
                mChart.notifyDataSetChanged();
                mChart.invalidate();

                final LineDataSet lineDataSet1;
                lineDataSet1= new LineDataSet(yData1,"Evening Quantity");
                lineDataSet1.setColor(Color.BLACK);
                LineData data1 = new LineData(lineDataSet1);
                XAxis xaxis1 =mChart2.getXAxis();
                xaxis1.setPosition(XAxis.XAxisPosition.BOTTOM);
                xaxis1.setCenterAxisLabels(false);
                YAxis yAxisRight1 = mChart2.getAxisRight();
                yAxisRight1.setEnabled(false);
                xaxis1.setDrawGridLines(true);
                xaxis1.setValueFormatter(new IAxisValueFormatter() {
                    @Override
                    public String getFormattedValue(float value, AxisBase axis) {

                        return xData1.get((int) value - 1);
                    }
                });

                if (xData1.isEmpty()||xData1.size()==1) {
                    mChart2.clear();
                } else {
                    // set data
                    mChart2.setData(data1);
                    //mChart.setBackgroundColor(Color.rgb(244, 117, 117));
                }
                mChart2.getXAxis().setGranularityEnabled(true);
                mChart2.setNoDataText("Please add atleast 2 Entries");
                mChart2.notifyDataSetChanged();
                mChart2.invalidate();

            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {
                Log.i("Graph Error: ",error.getMessage());
            }
        });
    }
}