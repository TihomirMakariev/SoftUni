package Java_OOP._13_SOLID.p01_SingleResponsibility.p01_DrawingShape;

import Java_OOP._13_SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingManager;
import Java_OOP._13_SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.DrawingRepository;
import Java_OOP._13_SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Renderer;
import Java_OOP._13_SOLID.p01_SingleResponsibility.p01_DrawingShape.interfaces.Shape;


public class DrawingManagerImpl implements DrawingManager {

    private final DrawingRepository drawingRepository;
    private final Renderer renderer;

    public DrawingManagerImpl(DrawingRepository drawingRepository, Renderer renderer) {
        this.drawingRepository = drawingRepository;
        this.renderer = renderer;
    }


    @Override
    public void draw(Shape shape) {
       renderer.render(drawingRepository, shape);
    }
}
