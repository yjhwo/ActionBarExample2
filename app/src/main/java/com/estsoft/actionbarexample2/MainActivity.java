package com.estsoft.actionbarexample2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById( R.id.button1 ).setOnClickListener( this );
        findViewById( R.id.button2 ).setOnClickListener( this );
        findViewById( R.id.button3 ).setOnClickListener( this );
    }

    @Override
    public void onClick( View view ) {
        int viewId = view.getId();

        if( viewId == R.id.button1 ) {

            Intent intent = new Intent( this, ActionItemsActivity.class );
            startActivity( intent );

        } else if( viewId == R.id.button2 ) {

            Intent intent = new Intent( this, ActionModesActivity.class );
            startActivity( intent );

        } else if( viewId == R.id.button3 ) {
            Intent intent = new Intent( this, ActionSearchActivity.class );
            startActivity( intent );
        }


    }
}
