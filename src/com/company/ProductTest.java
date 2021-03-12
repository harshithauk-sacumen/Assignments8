package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @org.junit.jupiter.api.Test
    void getQty() {
        Product p = new Product("fan", 2, 100, 200);
        assertEquals(2, p.getQty());
    }

}