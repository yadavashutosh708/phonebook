import { useNavigate } from "react-router";
import styles from "./ErrorPage.module.css";
import { IoMdArrowRoundBack } from "react-icons/io";

function ErrorPage() {
  const navigate = useNavigate();

  function onHandleNavigateBack() {
    navigate(-1);
  }

  return (
    <div className={styles.container}>
      <h1 className={styles.title}>404</h1>
      <p className={styles.desc}>Page Not Found!</p>
      <p className={styles.details}>
        The page is missing or you assembled the link incorrectly.
      </p>
      <button className={styles.btn} onClick={onHandleNavigateBack}>
        <IoMdArrowRoundBack />
        <span> Go Back</span>
      </button>
    </div>
  );
}

export default ErrorPage;
