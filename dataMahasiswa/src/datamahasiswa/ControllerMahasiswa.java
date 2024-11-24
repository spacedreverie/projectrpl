/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ControllerMahasiswa {
    ArrayList <ModelMahasiswa> ArrayData;
    DefaultTableModel tabelist;
    
    public ControllerMahasiswa(){
        ArrayData = new ArrayList<ModelMahasiswa>();
    }
    
    public void InsertData(String npm, String nama, int tinggi, boolean pindahan){
        ModelMahasiswa mhs  = new ModelMahasiswa(npm, nama, tinggi, pindahan);
        ArrayData.add(mhs);
        
    }

public DefaultTableModel showData() {
    String[] kolom = {"NPM", "Nama", "Tinggi", "Pindahan"};
    Object[][] objData = new Object[ArrayData.size()][4];
    int i = 0;

    for (ModelMahasiswa n : ArrayData) {
        String[] arrData = {n.getNPM(), n.getNama(), String.valueOf(n.getTinggi()), String.valueOf(n.isPindahan())};
        objData[i] = arrData;
        i++;
    }

    tabelist = new DefaultTableModel(objData, kolom) {
        @Override
        public boolean isCellEditable(int rowIndex, int colIndex) {
            return false;
        }
    };
    return tabelist;
}


}

      

      
