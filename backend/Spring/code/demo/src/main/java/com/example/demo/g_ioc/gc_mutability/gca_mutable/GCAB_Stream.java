package com.example.demo.g_ioc.gc_mutability.gca_mutable;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/mutable-stream")
@RestController
public class GCAB_Stream {

    /**
     * Mutable Singleton attribute
     * Se guarda en la memoria del servido
     * Se comparte por todos los usuarios
     */
    public Integer price;
    public List<GCAB_Stream> prices;

    // 
    GCAB_Stream mutableStream = new GCAB_Stream();

    @GetMapping("/prices")
    public List<GCAB_Stream> prices() {
        // mutableStream
        //     .prices
        //     .stream()
        //     .map(p -> {
        //         Integer newPrice = p.getPrice();
        //         newPrice *= 2;
        //         p.setPrice(newPrice);
        //         return p;
        //     });
        return mutableStream.prices;
    }

    //
    public GCAB_Stream() {
        prices = Arrays.asList(new GCAB_Stream(1), new GCAB_Stream(2));
    }

    public GCAB_Stream(Integer price) {
        this.price = price;
    }

    // 
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public List<GCAB_Stream> getPrices() {
        return prices;
    }

    public void setPrices(List<GCAB_Stream> prices) {
        this.prices = prices;
    }

    

}
