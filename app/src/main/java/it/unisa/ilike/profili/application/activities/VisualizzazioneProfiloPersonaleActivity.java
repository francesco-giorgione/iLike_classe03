package it.unisa.ilike.profili.application.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import it.unisa.ilike.R;
import it.unisa.ilike.contenuti.application.activities.VisualizzazioneHomepageActivity;
import it.unisa.ilike.liste.application.activities.CreazioneListaActivity;

public class VisualizzazioneProfiloPersonaleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualizzazione_profilo_personale);

        Intent i = getIntent();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }


    public void onClickLogout(View v){
        Intent i = new Intent();
        /*
        AccountImpl account = new AccountImpl();

        Account a = account.logout();

        */
    }

    public void onClickAggiungiLista(View v){
        Intent i = new Intent();
        i.setClass(getApplicationContext(), CreazioneListaActivity.class);
        startActivity(i);
    }

    public void onClickHomepage(View v){
        Intent i = new Intent();
        i.setClass(getApplicationContext(), VisualizzazioneHomepageActivity.class);
        startActivity(i);
    }
}