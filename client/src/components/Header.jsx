import { NavLink } from "react-router-dom";
import styles from "./Header.module.css";
import { FcPhoneAndroid } from "react-icons/fc";

function Header() {
  return (
    <div className={styles.header}>
      <p className={styles.title}>
        <FcPhoneAndroid /> <span>PhoneBook</span>
      </p>
      <nav>
        <ul className={styles.ul}>
          <li className={styles.li}>
            <NavLink
              to={"/"}
              className={({ isActive }) =>
                isActive
                  ? `${styles.link} ${styles.activeLink}`
                  : `${styles.link} `
              }
            >
              Home
            </NavLink>
          </li>
          <li className={styles.li}>
            <NavLink
              to={"/signup"}
              className={({ isActive }) =>
                isActive
                  ? `${styles.link} ${styles.activeLink}`
                  : `${styles.link} `
              }
            >
              Sign Up
            </NavLink>
          </li>
          <li className={styles.li}>
            <NavLink
              to={"/signin"}
              className={({ isActive }) =>
                isActive
                  ? `${styles.link} ${styles.activeLink}`
                  : `${styles.link} `
              }
            >
              Sign In
            </NavLink>
          </li>
          <li className={styles.li}>
            <NavLink
              to={"/about"}
              className={({ isActive }) =>
                isActive
                  ? `${styles.link} ${styles.activeLink}`
                  : `${styles.link} `
              }
            >
              About
            </NavLink>
          </li>
        </ul>
      </nav>
      <button className={styles.btn}>Logout</button>
    </div>
  );
}

export default Header;
