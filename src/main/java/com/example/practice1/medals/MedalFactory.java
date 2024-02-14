package com.example.practice1.medals;

import com.example.practice1.resolveMedal.Employee;
import com.example.practice1.resolveMedal.Material;
import com.example.practice1.resolveMedal.MaterialDetail;

public class MedalFactory {

    private Employee[] employees;
    private static final double PROFIT = 1.2;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * 材料から商品を作成する
     * １０個の材料を渡したら１０個の商品が出来上がります
     * 
     * @param materials
     * @return
     *         材料が金の場合→金メダルを作成する
     *         材料が銀の場合→銀メダルを作成する
     *         材料が銅の場合→銅メダルを作成する
     *         材料が上記以外の場合→不良品という製品名にして値段を０円にする
     */
    
    public Medal[] makeMedal(Material[] materials) {

    int materialCount = materials.length;
    Medal[] medals = new Medal[materialCount];

    for (int i = 0; i < materials.length; i++) {
        Material material = materials[i];
        Medal medal = new Medal();
        
        if(MaterialDetail.getMaterialGold().equals(material.getName())){
            medals[i].setName(MaterialDetail.getMedalGold());
            medals[i].setPrice(calcMedal(MaterialDetail.getMaterialGoldCost(), materialCount));
        }else if(MaterialDetail.getMaterialSilver().equals(material.getName())){
            medals[i].setName(MaterialDetail.getMedalSilver());
            medals[i].setPrice(calcMedal(MaterialDetail.getMaterialSilverCost(), materialCount));
        }else if(MaterialDetail.getMaterialCopper().equals(material.getName())){
            medals[i].setName(MaterialDetail.getMedalCopper());
            medals[i].setPrice(calcMedal(MaterialDetail.getMaterialCopperCost(), materialCount));
        }else{
            medals[i].setName(MaterialDetail.getMedalWood());
            medals[i].setPrice(0);

        }
        medals[i] = medal;
    }
    return medals;
    }
        
        /**
         * メダルの価格を求めるメソッド
         * makeMedal()にてセットする
         */
        private int calcMedal(int materialCost, int medalCost){

            int totalSalary = totalSalary();

            int medaPrice = (int) (materialCost + (totalSalary / medalCost) * PROFIT);
            return medaPrice;
        }
        
        
        /**
         * int priceを求めるためにtotalSalaryを出す
         * 製品の価格 ＝ 材料のコスト + (従業員の給料の合計 / 製品数 )* 1.2
         * price = cost + (totalSalary / medalsCount )* PROFIT
         * 
         */
        private int totalSalary(){
            int totalSalary = 0;
            for (int j = 0; j < employees.length; j++) {
                totalSalary = totalSalary + employees[j].getSalary();
            }
            return totalSalary;
            
        }
}