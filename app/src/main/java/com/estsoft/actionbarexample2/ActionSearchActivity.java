package com.estsoft.actionbarexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class ActionSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_action_search );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.
                add("Search").
                setIcon( android.R.drawable.ic_menu_search ).
                setActionView( R.layout.collapsible_edittext ).
                setShowAsAction( MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW );

        return true;
    }
}
