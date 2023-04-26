package carros;

import java.util.ArrayList;
import java.util.List;

public class Printer
{
    List<Carros> carros = new ArrayList<>();
    carros.add (new Gol());
    carros.add (new Uno());
    carros.add (new Corsa());

    public static void imprimirCarros(List<? extends Carros> lista)
    {
        for (Object carros : lista)
        {
            System.out.println(carros);
        }
    }
}


