package com.example.aamersohail.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import static com.example.aamersohail.intentexample.R.id.submit;

public class MainActivity extends AppCompatActivity {

    ImageButton submit;
    public EditText name;
    Intent intent;
    Bundle bundle;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setIds();
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bundle.putString("myname",name.getText().toString());
                intent.putExtras(bundle);
                //intent.putExtra("myName1",name.toString());
                startActivity(intent);
            }
        });
    }
    private void setIds(){
        submit=findViewById(R.id.submit);
        name=findViewById(R.id.name);
        intent=new Intent(MainActivity.this,Main2Activity.class);
        bundle=new Bundle();
    }

/*
   public EditText getName() {
        return name;
    }
    public MainActivity createObject(){
        return this;
    }*/
}
