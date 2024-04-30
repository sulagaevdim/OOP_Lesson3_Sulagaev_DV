1. Создайте несколько экземпляров Pharmasy, причем, чтобы среди них было хотя бы 2 экземпляра с полностью идентичными знаеними полей

2. Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные объекты:
   Set<Pharmacy> result = new HashSet<>(множество из нескольких лекарств)
   System.out.println(result.size()) // вывод должен быть равен количеству УНИКАЛЬНЫХ экземпляров Pharmacy!

3. Добавить интерфейс Comparable<Pharmacy> к классу Pharmacy. Переопределить метод compareTo(). Подксказка: можно добавить, а можно не добавлять в класс поля.

ссылка на статью о equals и hashCode: javarush.com/groups/posts/2179-metodih-equals--hashcode-praktika-ispoljhzovanija

формат сдачи - ссылка на кит