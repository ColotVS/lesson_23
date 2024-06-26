public class lesson_01 {
    //Причины существования интерфейсов — поддержка заявленного поведения

    //В более широком смысле интерфейс какой-нибудь вещи –
    //это механизм взаимодействия этой вещи с другими предметами.

    //По сути интерфейс – это стандартизированный способ взаимодействия двух вещей,
    //и этот стандарт известен двум сторонам.

    //Методы – это действия над объектом, над его данными.
    //И если класс реализует определенные методы, то он «поддерживает исполнение» определенных команд.
    //Какие же преимущества дает объединение методов в интерфейс?

    //1) Каждый interface, как и class, имеет уникальное имя. Обе стороны могут быть на 100% уверены,
    //что вторая сторона поддерживает именно нужный (известный им) интерфейс, а не похожий.

    //2) Каждый интерфейс налагает определенные ограничения на тот класс, который собирается поддерживать его.
    //Класс сам решает (его разработчик), что он будет делать в случае вызова его методов, которые он унаследовал от интерфейса,
    //но результат должен находиться в пределах ожиданий.

    //Чтобы поддержать реализацию какого-то интерфейса (группы интерфейсов) в своем классе нужно:
    //1)Унаследоваться от них
    //2)Реализовать объявленные в них методы
    //3) Методы должны делать то, для чего они предназначены.

    //Тогда остальной код программы, который ничего не знает о твоем классе и его объектах, сможет успешно работать с ним.

    //Тысячи объектов, которые взаимодействуют друг с другом.
    //И они могут с легкостью правильно взаимодействовать с твоими объектами,
    //если взаимодействие организовано через интерфейсы,
    //и ты правильно реализовал эти интерфейсы в своих классах.
}
