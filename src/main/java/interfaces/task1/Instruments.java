package interfaces.task1;

class Guitar implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет гитара");
    }
}

class Piano implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет пианино");
    }
}

class Drum implements MusicalInstrument {
    @Override
    public void play() {
        System.out.println("Играет барабан");
    }
}

class Starter {
    public static void main(String[] args) {
        MusicalInstrument[] instruments = new MusicalInstrument[3];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        instruments[2] = new Drum();

        for (MusicalInstrument instrument : instruments) {
            instrument.play();
        }
    }
}