package com.company;

public class Main {

    public static void main(String[] args) {
        SystemAudioSpecyficzny sSystem = new SystemAudioSpecyficzny();
        sSystem.odtwarzaj();
        sSystem.nagrywaj();
        sSystem.odtwarzajRadio();
        sSystem.wylacz();

        // Inne możliwości
        OdtwarzaczAudio OdtwarzaczAudio = sSystem;
        OdtwarzaczAudio.odtwarzaj();

        NagrywarkaAudio NagrywarkaAudio = sSystem;
        NagrywarkaAudio.nagrywaj();

        OdtwarzaczRadio OdtwarzaczRadio = sSystem;
        OdtwarzaczRadio.odtwarzajRadio();

        SystemAudio SystemAudio = sSystem;
        SystemAudio.odtwarzaj();
        SystemAudio.nagrywaj();
    }
}

interface OdtwarzaczAudio{
    void odtwarzaj();
}

interface NagrywarkaAudio{
    void nagrywaj();
}

interface OdtwarzaczRadio {
    void odtwarzajRadio();
}

interface  SystemAudio extends OdtwarzaczAudio, NagrywarkaAudio {

}

abstract class SystemAudioPodstawowy implements SystemAudio, OdtwarzaczRadio {

    public void odtwarzaj() {
        System.out.println("odtwarzaj audio");
    }

    public void nagrywaj() {
        System.out.println("nagrywaj audio");
    }

}

class SystemAudioSpecyficzny extends SystemAudioPodstawowy {
    @Override
    public void odtwarzajRadio() {
        System.out.println("odtwarzaj Radio");
    }

    public void wylacz() {
        System.out.println("Wyłącz");
    }
}