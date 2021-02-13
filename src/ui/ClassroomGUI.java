package ui;

import java.io.IOException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.Classroom;
import model.UserAccount;

public class ClassroomGUI {
	@FXML
	private Pane welcomePane;

	@FXML
	private TextField txtName;

	@FXML
	private TextField txtPassword;

	@FXML
	private TextField txtUserName;

	@FXML
	private PasswordField txtNewPassword;

	@FXML
	private TextField txtImage;

	@FXML
	private RadioButton rbMale;

	@FXML
	private ToggleGroup tgGender;

	@FXML
	private RadioButton rbFemale;

	@FXML
	private RadioButton rbOther;

	@FXML
	private DatePicker dpBirthday;

	@FXML
	private ComboBox<?> combBrowser;

	@FXML
	private Label labelUserName;

	@FXML
	private ImageView ivUser;

	@FXML
	private TableView<UserAccount> tvAccountList;

	@FXML
	private TableColumn<UserAccount, String> tcUsername;

	@FXML
	private TableColumn<UserAccount, String> tcGender;

	@FXML
	private TableColumn<UserAccount, String> tcCareer;

	@FXML
	private TableColumn<UserAccount, String> tcBirthday;

	@FXML
	private TableColumn<UserAccount, String> tcBrowser;

	private Classroom classroom;

	public ClassroomGUI(Classroom c) {
		classroom = c;
	}

	private void initializeTableView() {
		ObservableList<UserAccount> observableList;
		observableList = FXCollections.observableArrayList(classroom.getAccounts());

		tvAccountList.setItems(observableList);
		tcUsername.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("username")); // the tableview
																									// search for a
																									// method called
																									// getName
		tcGender.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("gender"));
		tcCareer.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("career"));
		tcBirthday.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("birthday"));
		tcBrowser.setCellValueFactory(new PropertyValueFactory<UserAccount, String>("browser"));
	}

	@FXML
	public void showLogin(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));

		fxmlLoader.setController(this);
		Parent loginPane = fxmlLoader.load();

		welcomePane.getChildren().clear();
		welcomePane.getChildren().setAll(loginPane);
	}

	@FXML
	void createAccount(ActionEvent event) {
		classroom.addAccount(txtUserName.getText(), txtNewPassword.getText(), photo, gender, career, birthday, browser);
	}

	@FXML
	void logIn(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("account.list.fxml"));

		fxmlLoader.setController(this);
		Parent AccountListPane = fxmlLoader.load();

		welcomePane.getChildren().clear();
		welcomePane.getChildren().setAll(AccountListPane);
		initializeTableView();

	}

	@FXML
	public void signUp(ActionEvent event) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("register.fxml"));

		fxmlLoader.setController(this);
		Parent registerPane = fxmlLoader.load();

		welcomePane.getChildren().clear();
		welcomePane.getChildren().setAll(registerPane);
	}

	@FXML
	void browseImage(ActionEvent event) {

	}

	@FXML
	void browserSelected(ActionEvent event) {

	}

	@FXML
	void careerSelected(ActionEvent event) {

	}

	@FXML
	void genderSelected(ActionEvent event) {

	}

	@FXML
	void selectDate(ActionEvent event) {

	}

	@FXML
	void logOut(ActionEvent event) {

	}

}
