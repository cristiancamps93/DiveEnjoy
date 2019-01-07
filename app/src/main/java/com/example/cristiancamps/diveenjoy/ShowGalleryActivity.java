package com.example.cristiancamps.diveenjoy;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

//Clase para printar la galeria
public class ShowGalleryActivity extends Activity{

    public static int mSelected = 0;
    private GridView gridview;

    public static Integer[] ImagenesMiniatura = new Integer[]{
            R.drawable.i1, R.drawable.i2, R.drawable.i3,
            R.drawable.i5, R.drawable.i7, R.drawable.i9,
            R.drawable.i10, R.drawable.i12, R.drawable.i14
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_gallery);

        //Hacemos referencia a nuestro grid view
        gridview = (GridView) findViewById(R.id.gridView_gallery);

        //Asignamos el ImageAdapter que hemos creado en esta misma clase al GridView
        gridview.setAdapter(new ImageAdapter(this));

        //Nos movemos al elemento seleccionado del GridView
        gridview.setSelection(mSelected);
    }
    public boolean onCreateOptionMenu (Menu menu){
        //Inflamos el menu: agrega elementos a la barra de accion si esta presente

        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }



    //Creamos una clase para almacenar las imagenes en el gridview
    public class ImageAdapter extends BaseAdapter{
        private Context mContext;

        public ImageAdapter(Context c){
            mContext = c;
        }
        @Override
        public int getCount() {
            return ImagenesMiniatura.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(final int i, View view, ViewGroup viewGroup) {
            ImageView imageView;
            //Si no se recicla, inicializar algunos atributos
            if(view==null){
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 130));
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    imageView.setCropToPadding(true);
                }else{
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                }
                imageView.setPadding(2,2,2,2);
            }else{
                imageView = (ImageView) view;
            }

            // Asignamos a cada imageview una imagen de nuestro array de recursos. Utilizamos setImageResource ya que nuestras
            // imagenes estan almacenadas en una carpeta de recurses en nuestro proyecto.

            imageView.setImageResource(ImagenesMiniatura[i]);

            // En el evento click del imageview obtenemos el indice de la imagen seleccionada

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mSelected = (Integer) view.getTag();
                    notifyDataSetChanged();

                    String index = String.valueOf(i);
                    Bundle extras = new Bundle();

                    //Pasamos el indice de la imagen seleccionada a la siguiente actividad.
                    extras.putString("position", index);
                    startActivity(new Intent(ShowGalleryActivity.this, SwipeImageActivity.class).putExtras(extras).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
                }
            });
            try{
                imageView.setTag(i);
                // Ponemos un borde de color azul a la imagen en miniatura seleccionada en el gridview
                if (i==mSelected){
                    imageView.setBackgroundColor(Color.parseColor("#ff0000"));
                }else{
                    imageView.setBackgroundColor(Color.TRANSPARENT);
                }
            }catch (Exception e){
                e.printStackTrace();
            }

            return imageView;
        }
    }

}
