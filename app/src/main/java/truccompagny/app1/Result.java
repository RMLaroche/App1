package truccompagny.app1;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    protected TextView tId;
    protected TextView tNom;
    protected TextView tPrenom;
    protected TextView tDate;
    protected TextView tAutorisation;

    protected ImageButton bCheck;
    protected ImageButton bRetour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.tId = (TextView) findViewById(R.id.txtId);
        this.tNom = (TextView) findViewById(R.id.txtNom);
        this.tPrenom = (TextView) findViewById(R.id.txtPrenom);
        this.tDate = (TextView) findViewById(R.id.txtDate);
        this.tAutorisation = (TextView) findViewById(R.id.txtAutorisation);

        this.bCheck = (ImageButton) findViewById(R.id.buttonCheck);
        this.bRetour = (ImageButton) findViewById(R.id.buttonRetour);


        ////////////////////////////////////////////////////////////////////////////////////////////
        this.tId.setText("04654531651561561861231");
        this.tNom.setText("LARUCHE");
        this.tPrenom.setText("REMY");
        this.tDate.setText("05/03/1998");
        this.tAutorisation.setText("NON AUTORISE");
        ////////////////////////////////////////////////////////////////////////////////////////////

        bCheck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                TextView tId = (TextView) findViewById(R.id.txtId);
                TextView tNom = (TextView) findViewById(R.id.txtNom);
                TextView tPrenom = (TextView) findViewById(R.id.txtPrenom);
                TextView tDate = (TextView) findViewById(R.id.txtDate);
                TextView tAutorisation = (TextView) findViewById(R.id.txtAutorisation);

                Verif.verifier(tId, tNom, tPrenom, tDate, tAutorisation);
            }
        });



        Verif.verifier(tId, tNom, tPrenom, tDate, tAutorisation);
    }

}
