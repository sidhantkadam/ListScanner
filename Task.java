public class Task
{
    private Integer id;
    private String description;
    private boolean completed;

    public Task(Integer id, String description)
    {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString()
    {
        return "Task: " +
                "id=" + id +
                ", description='" + description + '\'' +
                ", completed=" + completed ;
    }
}
