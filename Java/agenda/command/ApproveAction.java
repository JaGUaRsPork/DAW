package command;

public class ApproveAction extends ConfirmButton{

	public ApproveAction(String path, String path2, String title, int posX, int posY,AgendaDevice agendaDevice) {
		super(path, path2, title, posX, posY,agendaDevice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		agendaDevice.approve();
		
	}

}
