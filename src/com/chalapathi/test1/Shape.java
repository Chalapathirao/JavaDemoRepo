package com.chalapathi.test1;

public sealed class Shape
        permits Circle, Rectangle, Triangle { /*...*/
}

final class Circle extends Shape { /*...*/
}

 final class Rectangle extends Shape { /*...*/
}

non-sealed class Triangle extends Shape { /*...*/
}

class test extends Triangle{

}
