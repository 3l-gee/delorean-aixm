import { DropDownButton } from "./button/dropDownButton";
import { ToggleSwitch } from "./button/toggleButton";
import { useState, useEffect } from "preact/hooks";
import { Link } from "preact-router/match";

import "./navbar.css";
import GithubIcon from "../assets/github.svg";
import LinkedinIcon from "../assets/linkedin.svg";
import MastodonIcon from "../assets/mastodon.svg";
import XIcon from "../assets/x.png";
import BlueSkyIcon from "../assets/bluesky.png";
import AtIcon from "../assets/at.svg";
import DeloreanIcon from "../assets/logo/delorean-aixm-logo-big.svg";


export function Navbar({ onNavigate , onCleanBackground}) {
  const [lightTheme, setLightTheme] = useState(false);

  useEffect(() => {
    if (lightTheme) {
      document.documentElement.removeAttribute("data-theme");
    } else {
      document.documentElement.setAttribute("data-theme", "dark");
    }
  }, [lightTheme]);

  const [show, setShow] = useState(true);
  const [lastScrollY, setLastScrollY] = useState(0);

  useEffect(() => {
    const handleScroll = () => {
      const currentScrollY = window.scrollY;
      if (currentScrollY > lastScrollY && currentScrollY > 50) {
        setShow(false);
      } else {  
        setShow(true);
      }
      setLastScrollY(currentScrollY);
    };

    window.addEventListener("scroll", handleScroll);
    return () => window.removeEventListener("scroll", handleScroll);
  }, [lastScrollY]);

  return (
    <div className={`navbar ${show ? "show" : "hide"} icons`}>
        <Link
          href="/"
          className="navbar-logo no-underline text-inherit cursor-pointer bg-transparent border-none p-0 m-0 text-left"
          onClick={() => onCleanBackground(false)}
        >
          <img
            src={DeloreanIcon}
            alt="Delorean AIXM Logo"
            className=""
            width="520"
            height="60"
          />
        </Link>
      <div className="navbar-links">
        <DropDownButton
          label="About"
          options={[
            { label: "Features", href: "/features" },
            { label: "Road Map", href: "/roadmap" },
          ]}
        />
        <DropDownButton
          label="Resources"
          options={[
            { label: "Tutorial", href: "/tutorial" },
            { label: "FAQ", href: "/faq" },
          ]}
        />
        <DropDownButton
          label="Get involve"
          options={[
            { label: "Ask a question", href: "https://github.com/3l-gee/delorean-aixm/discussions" },
            { label: "Open a ticket", href: "https://github.com/3l-gee/delorean-aixm/issues" }
          ]}
        />
      </div>

      {/* Right: Icons */}
      <div className="icons navbar-icons">
        <a
          href="https://github.com/3l-gee/delorean-aixm"
          target="_blank"
          rel="noopener noreferrer"
        >
          <img src={GithubIcon} alt="GitHub" className="w-[30px] h-[30px]" />
        </a>

        <a
          href="https://bsky.app/profile/delorean-aixm.bsky.social"
          target="_blank"
          rel="noopener noreferrer"
        >
          <img src={BlueSkyIcon} alt="BlueSky" className="w-[35px] h-[35px]" />
        </a>

        <a
          href="https://x.com/delorean_aixm"
          target="_blank"
          rel="noopener noreferrer"
        >
          <img src={XIcon} alt="X" className="w-[35px] h-[35px]" />
        </a>

        <a
          href="https://mastodon.social/@delorean_aixm"
          target="_blank"
          rel="noopener noreferrer"
        >
          <img src={MastodonIcon} alt="Mastodon" className="w-[32px] h-[32px]" />
        </a>

        <a
          href="mailto:delorean.aixm@gmail.com"
        >
          <img src={AtIcon} alt="At" className="w-[32px] h-[32px]" />
        </a>

        <ToggleSwitch
          leftLabel="☀️"
          rightLabel="🌙"
          defaultOn={false}
          onToggle={(isDark) => setLightTheme(isDark)}
        />
      </div>
    </div>
  );
}
