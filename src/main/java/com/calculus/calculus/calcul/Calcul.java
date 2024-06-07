package com.calculus.calculus.calcul;

import com.calculus.calculus.affirmation.Conjonction;
import com.calculus.calculus.affirmation.Mensonge;
import com.calculus.calculus.affirmation.Verite;

public class Calcul implements Conjonction {
    Mensonge monsonge = new Mensonge();
    Verite verite = new Verite();

    @Override
    public String et(Boolean affirmation1, Boolean affirmation2) {
        String calculusDit;
        if(affirmation1 && affirmation2){
            calculusDit = "C'est vrai";
        }else {
            calculusDit = "C'est faux";
        }
        return calculusDit;
    }

    @Override
    public String ou(Boolean affirmation1, Boolean affirmation2) {
        String calculusDit;
        if(affirmation1 || affirmation2){
            calculusDit = "C'est vrai";
        }else{
            calculusDit = "C'est faux";
        }
        return calculusDit;
    }

    @Override
    public String donc(Boolean affirmation1, Boolean affirmation2) {
        String calculusdit;
        if (!affirmation1 || affirmation2){
            calculusdit = "C'est fausse";
        }else {
            calculusdit = "C'est vrai";
        }
        return calculusdit;
    }
}
