package com.calc.calculatrice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    String operation;
    double resultat;
    boolean virgule;
    double terme1;
    double terme2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operation = "aucune";
        virgule = false;
        terme1 = 0;
        terme2 = 0;
        resultat = 0;
    }


    DecimalFormat decimalFormat = new DecimalFormat("#.##########");

    public  void rafraichirAffichage () {

        TextView affichage = findViewById(R.id.textViewResultat);
        TextView signe = findViewById(R.id.textViewEgal);
        Button BoutonPlus = findViewById(R.id.boutonPlus);
        Button BoutonMoins = findViewById(R.id.boutonMoins);
        Button BoutonFois = findViewById(R.id.boutonFois);
        Button BoutonDivise = findViewById(R.id.boutonDivise);
        Button BoutonEgal = findViewById(R.id.boutonEgal);
        Button BoutonVirgule = findViewById(R.id.boutonVirgule);


        if(operation.equals("egal")){
            // Désactive les boutons des operations "interdites"
            BoutonPlus.setEnabled(false);
            BoutonMoins.setEnabled(false);
            BoutonFois.setEnabled(false);
            BoutonDivise.setEnabled(false);
            BoutonEgal.setEnabled(false);
            BoutonVirgule.setEnabled(false);
            BoutonPlus.setAlpha(0.25f);
            BoutonMoins.setAlpha(0.25f);
            BoutonFois.setAlpha(0.25f);
            BoutonDivise.setAlpha(0.25f);
            BoutonEgal.setAlpha(0.25f);
            BoutonVirgule.setAlpha(0.25f);

            // Affiche résultat
            signe.setText("=");
            affichage.setText(decimalFormat.format(resultat));
        }
        else if(operation.equals("aucune")){
            // Active les boutons des operations "autorisées"
            BoutonPlus.setEnabled(true);
            BoutonMoins.setEnabled(true);
            BoutonFois.setEnabled(true);
            BoutonDivise.setEnabled(true);
            BoutonEgal.setEnabled(true);
            BoutonPlus.setAlpha(1f);
            BoutonMoins.setAlpha(1f);
            BoutonFois.setAlpha(1f);
            BoutonDivise.setAlpha(1f);
            BoutonEgal.setAlpha(1f);

            // Desactive bouton virgule si déjà activé
            if(virgule){
                BoutonVirgule.setEnabled(false);
                BoutonVirgule.setAlpha(0.25f);
            }else{
                BoutonVirgule.setEnabled(true);
                BoutonVirgule.setAlpha(1f);
            }

            // Affiche le 1er terme
            signe.setText("");
            affichage.setText(decimalFormat.format(terme1));
        }
        else if(operation.equals("plus")){
            // Désactive les boutons des operations "interdites"
            BoutonPlus.setEnabled(false);
            BoutonMoins.setEnabled(false);
            BoutonFois.setEnabled(false);
            BoutonDivise.setEnabled(false);
            BoutonPlus.setAlpha(0.25f);
            BoutonMoins.setAlpha(0.25f);
            BoutonFois.setAlpha(0.25f);
            BoutonDivise.setAlpha(0.25f);

            // Desactive bouton virgule si déjà activé
            if(virgule){
                BoutonVirgule.setEnabled(false);
                BoutonVirgule.setAlpha(0.25f);
            }else{
                BoutonVirgule.setEnabled(true);
                BoutonVirgule.setAlpha(1f);
            }

                // Affiche le 2nd terme
            signe.setText("+");
            affichage.setText(decimalFormat.format(terme2));
        }
        else if(operation.equals("moins")){
            // Désactive les boutons des operations "interdites"
            BoutonPlus.setEnabled(false);
            BoutonMoins.setEnabled(false);
            BoutonFois.setEnabled(false);
            BoutonDivise.setEnabled(false);
            BoutonPlus.setAlpha(0.25f);
            BoutonMoins.setAlpha(0.25f);
            BoutonFois.setAlpha(0.25f);
            BoutonDivise.setAlpha(0.25f);

            // Desactive bouton virgule si déjà activé
            if(virgule){
                BoutonVirgule.setEnabled(false);
                BoutonVirgule.setAlpha(0.25f);
            }else{
                BoutonVirgule.setEnabled(true);
                BoutonVirgule.setAlpha(1f);
            }

            // Affiche le 2nd terme
            signe.setText("-");
            affichage.setText(decimalFormat.format(terme2));
        }
        else if(operation.equals("fois")){
            // Désactive les boutons des operations "interdites"
            BoutonPlus.setEnabled(false);
            BoutonMoins.setEnabled(false);
            BoutonFois.setEnabled(false);
            BoutonDivise.setEnabled(false);
            BoutonPlus.setAlpha(0.25f);
            BoutonMoins.setAlpha(0.25f);
            BoutonFois.setAlpha(0.25f);
            BoutonDivise.setAlpha(0.25f);

            // Desactive bouton virgule si déjà activé
            if(virgule){
                BoutonVirgule.setEnabled(false);
                BoutonVirgule.setAlpha(0.25f);
            }else{
                BoutonVirgule.setEnabled(true);
                BoutonVirgule.setAlpha(1f);
            }

            // Affiche le 2nd terme
            signe.setText("x");
            affichage.setText(decimalFormat.format(terme2));
        }
        else if(operation.equals("divise")){
            // Désactive les boutons des operations "interdites"
            BoutonPlus.setEnabled(false);
            BoutonMoins.setEnabled(false);
            BoutonFois.setEnabled(false);
            BoutonDivise.setEnabled(false);
            BoutonPlus.setAlpha(0.25f);
            BoutonMoins.setAlpha(0.25f);
            BoutonFois.setAlpha(0.25f);
            BoutonDivise.setAlpha(0.25f);

            // Desactive bouton virgule si déjà activé
            if(virgule){
                BoutonVirgule.setEnabled(false);
                BoutonVirgule.setAlpha(0.25f);
            }else{
                BoutonVirgule.setEnabled(true);
                BoutonVirgule.setAlpha(1f);
            }

            // Si division par zero
            if(terme2 == 0){
                BoutonEgal.setEnabled(false);
                BoutonEgal.setAlpha(0.25f);
            }else{
                BoutonEgal.setEnabled(true);
                BoutonEgal.setAlpha(1f);
            }

            // Affiche le 2nd terme
            signe.setText("/");
            affichage.setText(decimalFormat.format(terme2));
        }
    }

    public void ajoutChiffre(int chiffre) {
        TextView affichage = findViewById(R.id.textViewResultat);

        if(operation.equals("egal")){
            renitialiser();
        }

        // Ecriture du 1er terme
        if(operation.equals("aucune")){
            if(virgule){
                String nombre = affichage.getText().toString();
                int nbDecimale;
                int indexVirgule = nombre.indexOf('.');
                if(indexVirgule == -1){
                    nbDecimale = 0;
                }else{
                    nbDecimale = nombre.length() - indexVirgule - 1;
                }
                terme1 = terme1 + chiffre/(Math.pow(10,nbDecimale+1));
            }else {
                terme1 = terme1*10f + chiffre;
            }
        }
        // Ecriture du 2nd terme
        else if(operation.equals("plus") || operation.equals("moins") || operation.equals("fois") || operation.equals("divise")){
            if(virgule){
                String nombre = affichage.getText().toString();
                int nbDecimale;
                int indexVirgule = nombre.indexOf('.');
                if(indexVirgule == -1){
                    nbDecimale = 0;
                }else{
                    nbDecimale = nombre.length() - indexVirgule - 1;
                }
                terme2 = terme2 + chiffre/(Math.pow(10,nbDecimale+1));
            }else {
                terme2 = terme2*10 + chiffre;
            }
        }
    }

    public  void renitialiser (){
        operation = "aucune";
        terme1 = 0;
        terme2 = 0;
        resultat = 0;
        virgule = false;
    }

    public void bouton0Action (View target) {
        ajoutChiffre(0);
        rafraichirAffichage();
    }
    public void bouton1Action (View target) {
        ajoutChiffre(1);
        rafraichirAffichage();
    }
    public void bouton2Action (View target) {
        ajoutChiffre(2);
        rafraichirAffichage();
    }
    public void bouton3Action (View target) {
        ajoutChiffre(3);
        rafraichirAffichage();
    }
    public void bouton4Action (View target) {
        ajoutChiffre(4);
        rafraichirAffichage();
    }
    public void bouton5Action (View target) {
        ajoutChiffre(5);
        rafraichirAffichage();
    }
    public void bouton6Action (View target) {
        ajoutChiffre(6);
        rafraichirAffichage();
    }
    public void bouton7Action (View target) {
        ajoutChiffre(7);
        rafraichirAffichage();
    }
    public void bouton8Action (View target) {
        ajoutChiffre(8);
        rafraichirAffichage();
    }
    public void bouton9Action (View target) {
        ajoutChiffre(9);
        rafraichirAffichage();
    }

    public void boutonEgalAction (View target) {
        if(operation.equals("aucune")){
            resultat = terme1;
        }
        else if(operation.equals("plus")){
            resultat = terme1 + terme2;
        }
       else if(operation.equals("moins")){
           resultat = terme1 - terme2;
       }
       else if(operation.equals("fois")){
            resultat = terme1 * terme2;
       }
       else if(operation.equals("divise")){
            resultat = terme1 / terme2;
       }

       operation = "egal";
       rafraichirAffichage();
    }
    public void boutonAnnuleAction (View target) {
        renitialiser();
        rafraichirAffichage();
    }
    public void boutonVirguleAction (View target) {
        virgule = true;
    }

    public void boutonPlusAction (View target) {
            operation = "plus";
            TextView signe = findViewById(R.id.textViewEgal);
            signe.setText("+");
            virgule = false;
            rafraichirAffichage();
    }
    public void boutonMoinsAction (View target) {
            operation = "moins";
            TextView signe = findViewById(R.id.textViewEgal);
            signe.setText("-");
            virgule = false;
            rafraichirAffichage();
    }
    public void boutonFoisAction (View target) {
            operation = "fois";
            TextView signe = findViewById(R.id.textViewEgal);
            signe.setText("x");
            virgule = false;
            rafraichirAffichage();
    }
    public void boutonDiviseAction (View target) {
            operation = "divise";
            TextView signe = findViewById(R.id.textViewEgal);
            signe.setText("/");
            virgule = false;
            rafraichirAffichage();
    }
}
