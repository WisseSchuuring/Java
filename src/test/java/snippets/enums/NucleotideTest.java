package snippets.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NucleotideTest {

    @Test
    void getMolecularWeight() {
        Nucleotide nuc = Nucleotide.T;
        System.out.println(nuc.getMolecularWeight());
    }
}