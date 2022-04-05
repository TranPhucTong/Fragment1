package com.example.myapplication111;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.graphics.Color;
import android.icu.text.CaseMap;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ListView lvContact;
    private CustomAdapter adapter=null ;
    public static ArrayList<Contact> list = new ArrayList<Contact>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lvContact =(ListView) findViewById(R.id.lv_context);
        list = new ArrayList<Contact>();
        list.add(new Contact(R.drawable.shoes_rm_preview_b,"Nike shoes-discount 50%"));
        list.add(new Contact(R.drawable.shoes_rm_preview_a,"Adidas shoes-discount 80%"));
        list.add(new Contact(R.drawable.shoes_rm_purple,"Nike Bicycle-discount 30%"));
        list.add(new Contact(R.drawable.shoes_rm_preview,"Yonex shoes-discount 50%"));
        list.add(new Contact(R.drawable.shoes_rm_yellow,"Victor shoes-discount 50%"));
        list.add(new Contact(R.drawable.shoes_white_removebg_preview,"Lining shoes-discount 50%"));
        list.add(new Contact(R.drawable.color_removebg_preview,"Binh Minh shoes-discount 90%"));

        adapter  = new CustomAdapter(this, R.layout.list_item, list);
        lvContact.setAdapter(adapter);

//        FragmentManager fragmentManager = getFragmentManager();
//        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                MainActivity2 mainActivity2 = new MainActivity2();
                if(position ==0){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.shoes_rm_preview_b);
                    mainActivity2.setArguments(bundle);

                }

                if(position ==1){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.shoes_rm_preview_a);
                    mainActivity2.setArguments(bundle);

                }

                if(position ==2){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.shoes_rm_purple);
                    mainActivity2.setArguments(bundle);

                }

                if(position ==3){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.shoes_rm_preview);
                    mainActivity2.setArguments(bundle);

                }

                if(position ==4){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.shoes_rm_yellow);
                    mainActivity2.setArguments(bundle);

                }

                if(position ==5){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.shoes_white_removebg_preview);
                    mainActivity2.setArguments(bundle);

                }
                if(position ==6){
                    Bundle bundle = new Bundle();
                    bundle.putInt("key",R.drawable.color_removebg_preview);
                    mainActivity2.setArguments(bundle);

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.layout_contact, mainActivity2).commit();






//                if(position==0){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.shoes_rm_preview_b);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//
//                if(position==1){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.shoes_rm_preview_a);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//                if(position==2){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.shoes_rm_purple);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//                if(position==3){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.shoes_rm_preview);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//                if(position==4){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.shoes_rm_yellow);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//                if(position==5){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.shoes_white_removebg_preview);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }
//                if(position==6){
//                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("image",R.drawable.color_removebg_preview);
//                    intent.putExtras(bundle);
//                    startActivity(intent);
//                }

            }
        });


    }

    @Override
    public void onClick(View view) {




    }
}