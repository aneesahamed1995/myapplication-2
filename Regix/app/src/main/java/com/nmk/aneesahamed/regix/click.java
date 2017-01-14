package com.nmk.aneesahamed.regix;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
/**
 * Created by Anees ahamed on 10-01-2017.
 */

public class click implements Serializable {
    public String name;
    public boolean isselected;
   public click()
   {

   }

    public click(String name)
    {
   this.name=name;
    }
    public click(String name,boolean isselected)
    {
this.name=name;
        this.isselected=isselected;
    }
    public String getName() {
        return name;
    }
    public boolean isSelected() {
        return isselected;
    }

    public void setSelected(boolean vis) {

        this.isselected =vis;
    }
}
