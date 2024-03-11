class SaveVisitor implements Visitor {

    @Override
    public void saveAsVector(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println("Saving the circle... with radius= " + circle.getRadius() +
                    " at position " + shape.getxPos() + ", " + shape.getyPos() +
                    " as vector");
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.println("Saving the triangle...with base = " + triangle.getBase() +
                    " height = " + triangle.getHeight() +
                    " at position " + shape.getxPos() + ", " + shape.getyPos() +
                    " as vector");
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("Saving the rectangle...with width = " + rectangle.getWidth() +
                    " height = " + rectangle.getHeight() +
                    " at position " + shape.getxPos() + ", " + shape.getyPos() +
                    " as vector");
        }
    }

    @Override
    public void saveAsRaster(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println("Saving the circle... with radius= " + circle.getRadius() +
                    " at position " + shape.getxPos() + ", " + shape.getyPos() +
                    " as raster");
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            System.out.println("Saving the triangle...with base = " + triangle.getBase() +
                    " height = " + triangle.getHeight() +
                    " at position " + shape.getxPos() + ", " + shape.getyPos() +
                    " as raster");
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("Saving the rectangle...with width = " + rectangle.getWidth() +
                    " height = " + rectangle.getHeight() +
                    " at position " + shape.getxPos() + ", " + shape.getyPos() +
                    " as raster");
        }
    }
}
