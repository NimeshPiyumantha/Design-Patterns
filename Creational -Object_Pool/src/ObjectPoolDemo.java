import services.ObjectPool;
import services.type.ExportingProcess;
import services.type.ExportingTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author : Nimesh Piyumantha
 * @project_Name : Design-Patterns
 * @date : 3/24/2023
 * @time : 12:51 AM
 * @since : 0.1.0
 **/
public class ObjectPoolDemo {
    private ObjectPool<ExportingProcess> pool;
    private AtomicLong processNo=new AtomicLong(0);
    public void setUp() {
        // Create a pool of objects of type ExportingProcess.
           /*Parameters:
             1) Minimum number of special ExportingProcess instances residing in the pool = 4
             2) Maximum number of special ExportingProcess instances residing in the pool = 10
             3) Time in seconds for periodical checking of minObjects / maxObjects conditions
                in a separate thread = 5.
             -->When the number of ExportingProcess instances is less than minObjects,
                 missing instances will be created.
             -->When the number of ExportingProcess instances is greater than maxObjects,
                  too many instances will be removed.
            -->If the validation interval is negative, no periodical checking of
                  minObjects / maxObjects conditions in a separate thread take place.
              These boundaries are ignored then.
           */
        pool = new ObjectPool<ExportingProcess>(4, 10, 5)
        {
            protected ExportingProcess createObject()
            {
                // create a test object which takes some time for creation
                return new ExportingProcess( processNo.incrementAndGet());
            }
        };
    }
    public void tearDown() {
        pool.shutdown();
    }
    public void testObjectPool() {
        ExecutorService executor = Executors.newFixedThreadPool(8);

        // execute 8 tasks in separate threads

        executor.execute(new ExportingTask(pool, 1));
        executor.execute(new ExportingTask(pool, 2));
        executor.execute(new ExportingTask(pool, 3));
        executor.execute(new ExportingTask(pool, 4));
        executor.execute(new ExportingTask(pool, 5));
        executor.execute(new ExportingTask(pool, 6));
        executor.execute(new ExportingTask(pool, 7));
        executor.execute(new ExportingTask(pool, 8));

        executor.shutdown();
        try {
            executor.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e)

        {
            e.printStackTrace();
        }
    }
    public static void main(String args[])  {
        ObjectPoolDemo op=new ObjectPoolDemo();
        op.setUp();
        op.tearDown();
        op.testObjectPool();
    }
}//End of the ObjectPoolDemo class.