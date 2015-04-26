/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zenzile.goodsdelivery.domain;

/**
 *
 * @author SIHLE
 */
public class Destination implements Address{

    @Override
    public String getStreet() {
        return "";
    }

    @Override
    public String gettSuburb() {
        return "";
    }

    @Override
    public String getTown() {
        return "";
    }

    @Override
    public int getCode() {
        return 0;
    }

}
