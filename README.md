# OOP_HomeWork

1. Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории) и включить в список продуктов в вендинг машину. Продемонстрировать работу класса по продаже товаров.
2. Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду.
Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль информацию о тарелке.
Если в методе main() создать объекты этих классов, то можно узнать информацию о тарелке и вызвать пустой метод eat() у кота. Эти объекты пока никак не могут взаимодействовать между собой. Можно добавить в классы геттеры и сеттеры и получить код вроде.

## ЗАДАНИЕ

* Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
* Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
* Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
* Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.

3. Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.

## ЗАДАНИЕ

* Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
* Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого).
* Придумать свой собственный компаратор.
* Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.

## ЗАДАНИЕ

* Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
* Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
* Для хранения фруктов внутри коробки можно использовать ArrayList;
* Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
* Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
* Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
* Не забываем про метод добавления фрукта в коробку.