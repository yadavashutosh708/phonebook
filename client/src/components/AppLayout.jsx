import { Outlet } from "react-router";
import Header from "./Header";
import styles from "./AppLayout.module.css";

const isAuthenticated = true;

function AppLayout() {
  return (
    <div className={styles.container}>
      {isAuthenticated && (
        <div className={styles.header}>
          <Header />
        </div>
      )}
      <main className={styles.main}>
        <Outlet />
      </main>
    </div>
  );
}

export default AppLayout;
