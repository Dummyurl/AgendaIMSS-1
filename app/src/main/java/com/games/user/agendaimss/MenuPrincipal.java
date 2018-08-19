package com.games.user.agendaimss;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MenuPrincipal extends AppCompatActivity {

    Button[] buttons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        //INSTANCIA de los id's de los buttons
        final int iDs[] = {R.id.pases,R.id.sustis,R.id.licencia,R.id.vales,R.id.otros };

        //INSTANCIA para los buttons
        buttons = new Button[5];
        for(int i =0; i<5; i++)
            buttons[i] = (Button)findViewById(iDs[i]);

        //SET del onClickListener de cada button
        for(int i =0; i<4; i++)
            buttons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(view.getId()){ //Obtenemos el ID del button que ha sido clickeado
                        case R.id.pases:
                            Intent intent1 = new Intent(MenuPrincipal.this,MainActivity.class);
                            startActivity(intent1);
                            break;
                        case R.id.sustis:
                            Intent intentae = new Intent(MenuPrincipal.this,Foto.class);
                            startActivity(intentae);
                            break;
                        case R.id.licencia:
                            Intent intentds = new Intent(MenuPrincipal.this,MainActivity.class);
                            startActivity(intentds);
                            break;
                        case R.id.vales:
                            Intent intentdss = new Intent(MenuPrincipal.this,MainActivity.class);
                            startActivity(intentdss);
                            break;
                        case R.id.otros:
                            Intent intent11s = new Intent(MenuPrincipal.this,MainActivity.class);
                            startActivity(intent11s);
                            break;


                    }
                }
            });


    }

}