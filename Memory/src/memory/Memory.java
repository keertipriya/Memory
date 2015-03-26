package memory;

public class Memory
{

        
   public static void main(String [] args)
   {
           int mb = 1024*1024;
          int gb = 1024*1024*1024;
            /* PHYSICAL MEMORY USAGE */
            System.out.println("\n**** Sizes in Mega Bytes ****\n");
           //com.sun.management.OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean)ManagementFactory.getOperatingSystemMXBean();
           
           com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean)
           java.lang.management.ManagementFactory.getOperatingSystemMXBean();
           long physicalMemorySize = os.getTotalPhysicalMemorySize();
           System.out.println("PHYSICAL MEMORY DETAILS \n");
           System.out.println("total physical memory : " + physicalMemorySize / mb + "MB ");
           long physicalfreeMemorySize = os.getFreePhysicalMemorySize();
           System.out.println("total free physical memory : " + physicalfreeMemorySize / mb + "MB");
          
       }
   }
