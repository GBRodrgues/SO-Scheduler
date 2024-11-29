public class Process {
    private String id; // Identificador do processo
    private int arrivalTime; // Tempo de chegada
    private int burstTime; // Tempo de execução
    private int priority; // Prioridade, se aplicável

    // Construtor
    public Process(String id, int arrivalTime, int burstTime, int priority) {
        this.id = id;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.priority = priority;
    }

    // Getters e Setters
    public String getId() {
        return id;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Process{" +
               "id='" + id + '\'' +
               ", arrivalTime=" + arrivalTime +
               ", burstTime=" + burstTime +
               ", priority=" + priority +
               '}';
    }
}
