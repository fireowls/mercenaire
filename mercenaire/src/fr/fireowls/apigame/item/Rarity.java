package fr.fireowls.apigame.item;

/**
 * @author MrKeesLer
 * @version 1.0.0
 * Liste des raretées des items
 */
public enum Rarity {
    /**
     * Commun
     */
    COMMON(52),
    /**
     * Peu commun
     */
    UNCOMMON(25),
    /**
     * Rare
     */
    RARE(15),
    /**
     * Epic
     */
    EPIC(7),
    /**
     * Légendaire
     */
    LEGENDARY(1);

    private int dropRate;

    private Rarity(int drop){
        this.dropRate = drop;
    }

    /**
     *
     * @return le taux de drop de la raretée
     */
    public int getDropRate(){
        return dropRate;
    }
}
