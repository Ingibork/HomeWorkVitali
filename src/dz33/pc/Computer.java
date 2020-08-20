package pc;

/**
 * 4*.Симулятор загрузки ПК:
 * 4.1 Сценарий: При запуске программы происходит включение воображаемого ПК. Тестируется и запускаеся оборудование
 * в следующем порядке:
 * 4.1.1 центральный процессор
 * 4.1.2 проверка контрольной суммы программы ПЗУ
 * 4.1.3 первые 64 байта ОЗУ (для рагрузки резидентных программ)
 * 4.1.4 контроллер графического адаптера
 * 4.1.5 ОЗУ
 * 4.1.6 БИОС
 * 4.1.7 контроллер COM-портов
 * 4.1.8 контроллер накопителей на жеских магнитных дисках
 * 4.2 Если какой-то тест не выполняется - дальнейшая проверка и запуск ОС непроисходит, выводится сообщение
 * от сбойного оборудования и код ошибки.
 * 4.3 Если все тесты пройдены - запускается ОС. В ходе загрузки может возникнуть синий экран смерти с кодом ошибки.
 * Если синего экрана не было - выводится приветствие.
 * 4.4 Всё оборудование объеденино одним интерфейсом. Интерфейс имеет два метода boolean test(), boolean run().
 * 4.5 Если кто-то попробует запустить оборудование которое не прошло проверку необходимо не дать его запустить,
 * если проверка выдало ошибку - значит и запускать данное оборудование более невозможно.
 */

public class Computer implements IComputer {
    boolean cp;
    boolean rom;
    boolean ram64;
    boolean graphics;
    boolean ram;
    boolean BIOS;
    boolean comport;
    boolean hdd;

    Computer(boolean cp, boolean rom, boolean ram64, boolean graphics, boolean ram, boolean BIOS,
             boolean comport, boolean hdd) {
        this.cp = cp;
        this.rom = rom;
        this.ram64 = ram64;
        this.graphics = graphics;
        this.ram = ram;
        this.BIOS = BIOS;
        this.comport = comport;
        this.hdd = hdd;
    }

    int count = 0;

    public void test() {


        if (cp) {
            System.out.println("cp тест пройден - " + cp);
            count ++;
        } else {
            System.out.println("cp error 1337!!!!!!!!!!!");
            return;
        }
        if (rom) {
            System.out.println("rom тест пройден - " + rom);
            count ++;
        } else {
            System.out.println("rom error 1337!!!!!!!!!!!");
            return;
        }
        if (ram64) {
            System.out.println("ram64 тест пройден - " + ram64);
            count ++;
        } else {
            System.out.println("ram64 error 1337!!!!!!!!!!!");
            return;
        }
        if (graphics) {
            System.out.println("graphics тест пройден - " + graphics);
            count ++;
        } else {
            System.out.println("graphics error 1337!!!!!!!!!!!");
            return;
        }
        if (ram) {
            System.out.println("ram тест пройден - " + ram);
            count ++;
        } else {
            System.out.println("ram error 1337!!!!!!!!!!!");
            return;
        }
        if (BIOS) {
            System.out.println("BIOS тест пройден - " + BIOS);
            count ++;
        } else {
            System.out.println("BIOS error 1337!!!!!!!!!!!");
            return;
        }
        if (comport) {
            System.out.println("comport тест пройден - " + comport);
            count ++;
        } else {
            System.out.println("comport error 1337!!!!!!!!!!!");
            return;
        }
        if (hdd) {
            System.out.println("hdd тест пройден - " + hdd);
            count ++;
        } else {
            System.out.println("hdd error 1337!!!!!!!!!!!");
        }

    }

    public void run() {
        if (count == 8) {
                System.out.println("Приветствие");
            } else System.out.println("СИНИЙ ЭКРАН СМЕРТИ!!!! 88005553535Error");
        }



    @Override
    public boolean tests() {
        return true;
    }

    @Override
    public boolean runs() {
        return true;
    }

}
