package it.unisa.ilike.liste.application;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.List;

import it.unisa.ilike.R;
import it.unisa.ilike.contenuti.storage.ContenutoBean;
import it.unisa.ilike.contenuti.storage.FilmBean;
import it.unisa.ilike.contenuti.storage.LibroBean;
import it.unisa.ilike.contenuti.storage.SerieTVBean;

public class VisualizzazioneContenutiListaPersonaleAdapter extends ArrayAdapter<ContenutoBean>{

    private LayoutInflater inflater;

    public VisualizzazioneContenutiListaPersonaleAdapter(@NonNull Context context, int resource, @NonNull List<ContenutoBean> objects) {
        super(context, resource, objects);
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        if (view == null) {
            view = inflater.inflate(R.layout.activity_list_element_ricerca_contenuto, null);
        }

        ContenutoBean c = getItem(position);

        ImageView icona;
        TextView titoloButton;
        TextView valutazioneMedia;

        icona = (ImageView) view.findViewById(R.id.img);
        titoloButton = (TextView) view.findViewById(R.id.nomeContenuto);
        valutazioneMedia = (TextView) view.findViewById(R.id.valutazioneMedia);


        titoloButton.setText(c.getTitolo());
        valutazioneMedia.setText(String.valueOf(c.getValutazioneMedia()));
        if (c instanceof FilmBean)
            icona.setImageDrawable(view.getResources().getDrawable(R.drawable.icona_film));
        else if (c instanceof SerieTVBean)
            icona.setImageDrawable(view.getResources().getDrawable(R.drawable.icona_serietv));
        else if (c instanceof LibroBean)
            icona.setImageDrawable(view.getResources().getDrawable(R.drawable.icona_libro));
        else
            icona.setImageDrawable(view.getResources().getDrawable(R.drawable.icona_musica));

        titoloButton.setTag(position);
        valutazioneMedia.setTag(position);

        return view;

    }
}