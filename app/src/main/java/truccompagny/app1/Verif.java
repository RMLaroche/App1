package truccompagny.app1;

import android.graphics.Color;
import android.widget.TextView;


public  class Verif {



    private Verif(){}

    static protected void verifier(TextView tId, TextView tNom, TextView tPrenom, TextView tDate, TextView tAutorisation){
        int i=0;
        if (tId.getText().toString().equals("04654531651561561861231")){
            tId.setTextColor(Color.rgb(0,200,0));
            i++;
        } else{
            tId.setTextColor(Color.rgb(200,0,0));
        }

        if (tNom.getText().toString().equals("LAROCHE")){
            tNom.setTextColor(Color.rgb(0,200,0));
            i++;
        } else{
            tNom.setTextColor(Color.rgb(200,0,0));
        }

        if (tPrenom.getText().toString().equals("REMY")){
            tPrenom.setTextColor(Color.rgb(0,200,0));
            i++;
        } else{
            tPrenom.setTextColor(Color.rgb(200,0,0));
        }

        if (tDate.getText().toString().equals("05/03/1998")){
            tDate.setTextColor(Color.rgb(0,200,0));
            i++;
        } else{
            tDate.setTextColor(Color.rgb(200,0,0));
        }

        if (i==4){
            tAutorisation.setText("AUTORISE");
            tAutorisation.setTextColor(Color.rgb(0,200,0));
        }else{
            tAutorisation.setText("NON AUTORISE");
            tAutorisation.setTextColor(Color.rgb(200,0,0));
        }

    }

}
