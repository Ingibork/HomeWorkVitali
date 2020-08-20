package pcomp;



public class PCmain {
    public static void main(String[] args) {
        System.out.println("Включается компьютер. Запускаем проверку оборудования...");
        PC pc = new PC();
        System.out.println("процессор работает - " + pc.cp);
        System.out.println("проверка контрольной суммы программы ПЗУ выполнена - " + pc.rom);
        System.out.println("первые 64 байта ОЗУ проверены - " + pc.ram64);
        System.out.println("контроллер графического адаптера проверен - " + pc.graphics);
        System.out.println("ОЗУ проверена - " + pc.ram);
        System.out.println("BIOS проверен - " + pc.BIOS);
        System.out.println("контроллер COM-портов проверен - " + pc.comport);
        System.out.println("контроллер накопителей на жеских магнитных дисках проверен - " + pc.hdd);



    }
}
