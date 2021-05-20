/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author ACER
 */
public class table_load {
        public int mon;
        public String time;
        public int tue;
        public int wed;
        public int thur;
        public int fri;
        public int sat;
        public int sun;
        
        public table_load(String time, int mon, int tue, int wed,int thur,int fri,int sat,int sun)
        {
            this.time = time;
            this.mon = mon;
            this.tue = tue;
            this.wed = wed;
            this.thur = thur;
            this.fri = fri;
            this.sat = sat;
            this.sun = sun;
        }

    public table_load() {
        
    }
}
