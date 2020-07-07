package PC;

import java.util.RandomAccess;

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

public class Computer {
    boolean cp = true;
    boolean rom = true;
    boolean ram64 = true;
    boolean graphics = true;
    boolean ram = true;
    boolean BIOS = true;
    boolean comport = true;
    boolean hdd = true;

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

    void print() {
        System.out.println("cp тест удачен " + cp);
        System.out.println("rom тест удачен " + rom);
        System.out.println("ram64 тест удачен " + ram64);
        System.out.println("graphics тест удачен " + graphics);
        System.out.println("ram тест удачен " + ram);
        System.out.println("BIOS тест удачен " + BIOS);
        System.out.println("comport тест удачен " + comport);
        System.out.println("hdd тест удачен " + hdd);
    }


}
