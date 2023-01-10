package it.unisa.ilike.profili.application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import it.unisa.ilike.R;
import it.unisa.ilike.liste.storage.ListaBean;
import it.unisa.ilike.recensioni.storage.RecensioneBean;

public class VisualizzazioneProfiloPersonaleListeAdapter extends ArrayAdapter<ListaBean> {

    private LayoutInflater inflater;

    public VisualizzazioneProfiloPersonaleListeAdapter(@NonNull Context context, int resource, @NonNull List<ListaBean> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        if (view == null) {
            view = inflater.inflate(R.layout.activity_list_element_visualizzazione_profilo_personale_liste, null);
        }

        ListaBean l = getItem(position);

        TextView nomeLista;

        nomeLista = (TextView) view.findViewById(R.id.nomeLista);

        nomeLista.setText(l.getNome());

        nomeLista.setTag(position);

        return view;
    }


}
