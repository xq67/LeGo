package message;

public class test {

	/**
	 * ������֤
	 */
	public static void main(String[] args) {
		//������֤��
		 String code = (int) (Math.random() * 9000 + 1000) + "";
		new ShortMessage().Send("18595751967", " ���û���ã���ӭע��ƽ̨�� ��֤�룺"+code);
	}

}
