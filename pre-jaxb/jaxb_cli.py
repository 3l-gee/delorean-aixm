import argparse
from lib.coordinator import Coordinator

def main():
    parser = argparse.ArgumentParser(description="Content build tool")
    parser.add_argument("--schema", required=True, help="Path to schema YAML")
    parser.add_argument("--config", required=True, help="Path to config YAML")
    parser.add_argument("--content", required=True, help="Path to content YAML")
    parser.add_argument("--verbose", action="store_true", help="Enable verbose logging")
    args = parser.parse_args()

    print("[INFO] pre-jaxb CLI started with arguments:", args)

    coordinator = Coordinator(args.schema, args.config, args.content, verbose=args.verbose)

    coordinator.initialize_xjb(verbose=args.verbose)

    coordinator.generate_xjb(verbose=args.verbose)

    # coordinator.validate_xjb(verbose=args.verbose)

    coordinator.export_xjb(verbose=args.verbose)

    coordinator.export_sql(verbose=args.verbose)

    coordinator.save_entity_class()

if __name__ == "__main__":
    main()
