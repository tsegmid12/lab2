package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
   private Shape shape;// Shape интерфейсийн объект

   //shape дүрийн объект
   public Renderer(Shape shape){
    this.shape = shape;
   }

   //дүрсийн талбайг хэвлэнэ, дүрс зурагдсан гэж бодъё
    void draw() {
        shape.draw();        
    }
}
