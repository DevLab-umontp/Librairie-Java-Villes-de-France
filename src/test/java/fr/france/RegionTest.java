package fr.france;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RegionTest {

    @Test
    void test_getDepartements() {
        for (Region region : Region.values()) {
            assertThat(getDepartementsFiltrePar(region), containsInAnyOrder(region.getDepartements()));
        }
    }

    private List<Departement> getDepartementsFiltrePar(Region region) {
        List<Departement> result = new ArrayList<>();
        for (Departement dep : Departement.values())
            if (dep.getRegion().equals(region))
                result.add(dep);
        return result;
    }
}
