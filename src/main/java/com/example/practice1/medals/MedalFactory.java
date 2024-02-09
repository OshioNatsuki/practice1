package com.example.practice1.medals;

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
    /**
     * int priceを求めるためにtotalSalaryを出す
     * 製品の価格　＝　材料のコスト + (従業員の給料の合計　/ 製品数　)* 1.2 
     * price = cost + (totalSalary / medalsCount )* PROFIT
     * 
     */
    public Medal[] makeMedal(Material[] materials) {

        
                
                int totalSalary = 0;
                for (int j = 0; j < employees.length; j++) {
                    totalSalary = totalSalary + employees[j].getSalary();
                }
        // メダルの数 ＝ マテリアルの数
        int medalsCount = materials.length;

        for (int i = 0; i < medalsCount; i++) {
            Medal[] medals = new Medal[i];

            if (MaterialDetail.getMaterialGold().equals(materials[i].getName())) {
                medals[i].setName(MaterialDetail.getMedalGold());
                medals[i].setPrice(MaterialDetail.getMaterialGoldCost()+ (totalSalary / materials.length )* PROFIT );
            } else if (MaterialDetail.getMaterialSilver().equals(materials[i].getName())) {
                medals[i].setName(MaterialDetail.getMedalSilver());
                // medals[i].setPrice(i);
            } else if (MaterialDetail.getMaterialCopper().equals(materials[i].getName())) {
                medals[i].setName(MaterialDetail.getMedalCopper());
                // medals[i].setPrice(i);
            }else { 
                medals[i].setName(MaterialDetail.getMedalWood());
                medals[i].setPrice(0);
            }

        }


    return makeMedal(materials);

    }




}
