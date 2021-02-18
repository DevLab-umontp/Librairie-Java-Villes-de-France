package fr.france.outils;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class OutilsString {

    private OutilsString() {
        throw new IllegalStateException("Class utilitaire");
    }



    public static String trouverLaMeilleurOccurence(Collection<String> c, String str) {
        PriorityQueue<Occurence> queue = new PriorityQueue<>(Comparator.comparing(Occurence::getDifference));
        queue.addAll(c.stream().map(x -> new Occurence(x, str)).collect(Collectors.toList()));
        Occurence occurence1 = queue.poll();
        Occurence occurence2 = queue.poll();
        if (occurence1.getDifference() != occurence2.getDifference())
            return occurence1.getValeur();
        return null;
    }



	public static Integer indexOfDifference(String str1, String str2) {
		return null;
	}
}
