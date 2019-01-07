package com.example.cristiancamps.diveenjoy;

import android.app.Activity;
import android.content.Context;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;



// Clase para visionar las imagenes

public class SwipeImageActivity extends Activity{

    //Hacemos referencia a las imagenes de la carpeta Drawable
    public static Integer[] Images = new Integer[]{
            R.drawable.i1, R.drawable.i2, R.drawable.i3,
            R.drawable.i5, R.drawable.i7, R.drawable.i9,
            R.drawable.i10, R.drawable.i12, R.drawable.i14
    };

    private boolean hideSwipeText;
    private String[] imagesDescriptions;

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.swipe_images);

        //Obtenemos del gridView de la activity anterior el indice de la imagen que se ha seleccionado
        String i = getIntent().getStringExtra("position");
        //Lo pasamos a entero
        int index = Integer.parseInt(i);

        //Obtenemos la descricion de la imagen seleccionada de la lista de arrays.xml (en values)
        imagesDescriptions = getResources().getStringArray(R.array.images_descriptions);

        SwipeImagePagerAdapter swipeNewsAdapter = new SwipeImagePagerAdapter();
        ViewPager newsPager = (ViewPager) findViewById(R.id.swipe_pager);
        newsPager.setAdapter(swipeNewsAdapter);
        newsPager.setCurrentItem(index);

        //Interfaz de devolucion de llamada para responder a los cambios de estado de la pagina seleccionada

        newsPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {
                ShowGalleryActivity.mSelected = i;
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }

    //Creamos el SwipeImagePagerAdapter. Utilizara el layout show_images para cargar la imagen original y las descripciones

    private class SwipeImagePagerAdapter extends PagerAdapter{

        @Override
        public int getCount() {
            return ShowGalleryActivity.ImagenesMiniatura.length;
        }

        @Override
        public Object instantiateItem (ViewGroup collection, int position){
            //Layout inflater: Instancia un archivo XML diseño en sus correspondientes objetos
            LayoutInflater inflater = (LayoutInflater) collection.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //Referenciamos el show_images layout
            View view = inflater.inflate(R.layout.show_images, null);
            LinearLayout swipeDescription = (LinearLayout) view.findViewById(R.id.swipe_description);

            if(hideSwipeText){
                swipeDescription.setVisibility(View.GONE);
            }
            hideSwipeText = true;

            //Referenciamos el objeto ImageView del "show_images" layout
            ImageView imageView = (ImageView) view.findViewById(R.id.gallery_image);

            //Asignamos a cada imageview una imagen de nuestro array de recursos
            //Usamos setImageResources ya que nuestras imagenes estan almacenadas en una carpeta de recursos en nuestro proyecto

            imageView.setImageResource(Images[position]);

            //Referenciamos el objeto TextView y hacemos lo mismo para las descripciones
            TextView imageDescription = (TextView)view.findViewById(R.id.image_description);

            //Asignamos el test descriptivo de la imagen al objeto TextView
            imageDescription.setText(imagesDescriptions[position].toString());

            //Añadimos el view que hemos creado con los objetos imageview y textview
            collection.addView(view, 0);

            return view;

        }

        //Quitar una pagina para la posicion dada. El adaptador es responsable de quitar la vista de su contenedor
        //aunque solo debe garantizar esto se hace por el tiempo que regresa de finishupdate(viewgroup)

        @Override
        public void destroyItem (ViewGroup collection, int position, Object view){
            collection.removeView((View) view);
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return (view == o);
        }
    }


}
