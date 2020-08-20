package dz33;

    /**
     * 2. Создать класс Color:
     * 2.0 Все поля должны быть приватными, все методы должны быть публичны, конструктор должен быть публичным.
     * Статических методов быть не должно. Внимание никакой печати в консоль ВНУТРИ класса Color быть не должно.
     * 2.1 Создать конструктор который будет принимать параметр int. Туда мы будем передавать номер цвета.
     * 2.2 Внутри класса создать константы цветов радуги которые будут содержать номера цветов
     * (http://cyclowiki.org/wiki/ Каждый_охотник_желает_знать,_где_сидит_фазан). Например RED = 1, ORANGE = 2;
     * 2.3 Создать методы getNumber() и getName(). Данные методы не принимают никаких парамаметров.
     * 2.4 Метод getNumber должен вернуть int (номер цвета который мы передали в конструктор).
     * 2.5 Метод getName должен возвращать (String) название цвета на русском, если цвет нам не известен возвращать
     * строку "неизвестно".
     * 2.6 В методе getName должен использоваться switch и константы объявленные при выполнении первого пункта,
     * ЦИФР в свитче быть НЕ ДОЛЖНО БЫТЬ.
     * 3. В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр Color.
     * В конструктор передать число 3. Далее вывести в консоль номер цвета и его названия используя результат
     * выполнения методов getNumber и getName.
     */
    class Color {
        // 2,0 Приватные поля
        // 2,2 Внутри класса создать константы цветов радуги
        private final int RED = 1;
        private final int ORANGE = 2;
        private final int YELLOW = 3;
        private final int GREEN = 4;
        private final int BRIGHTBLUE = 5;
        private final int BLUE = 6;
        private final int PURPLE = 7;
        private int number;
        private String name;

        // 2.1 Конструктор принимающий int
        public Color(int number) {
            this.number = number;
        }

        //2.3 Геттер и сеттер Number
        public void setNumber(int userNumber) {
            this.number = userNumber;
        }

        //2.4 Возвращает int
        public int getNumber() {
            return this.number;
        }

        //2.3 Геттер и Сеттер Name
        public void setName(String colorName) {
            name = colorName;
        }

        public String getName() {
            switch (this.number) {
                case RED:
                    this.name = "Красный";
                    break;
                case ORANGE:
                    this.name = "Оранжевый";
                    break;
                case YELLOW:
                    this.name = "Жёлтый";
                    break;
                case GREEN:
                    this.name = "Зелёный";
                    break;
                case BRIGHTBLUE:
                    this.name = "Голубой";
                    break;
                case BLUE:
                    this.name = "Синий";
                    break;
                case PURPLE:
                    this.name = "Фиолетовый";
                    break;
                default:
                    this.name = "неизвестно";
                    break;
            }
            return this.name;
        }
    }

