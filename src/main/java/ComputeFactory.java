import java.lang.reflect.InvocationTargetException;

public class ComputeFactory {

    public static Computable getCompute(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Computable computable = (Computable) Class.forName(symbol).getDeclaredConstructor().newInstance();
        return computable;
    }
}
